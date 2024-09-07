# Roimarc Bilbao
# LBYARCH S11 - MP2

.data

# Pokemon types

normal: 	.word 1
fighting: 	.word 2
flying:	  	.word 3
poison: 	.word 4
ground:		.word 5
rock: 		.word 6
bug: 		.word 7
ghost: 		.word 8
steel: 		.word 9
fire:		.word 10
water:		.word 11
grass:		.word 12
electric:	.word 13 
psychic:	.word 14 
ice:		.word 15
dark:		.word 16
fairy:		.word 17
none:		.word 0

# Pokemon data


pokemon:
.word grass, poison
.word grass, poison
.word grass, poison
.word fire, none
.word fire, none
.word fire, flying
.word water, none
.word water, none
.word water, none
.word bug, none
.word bug, none
.word bug, flying
.word bug, poison
.word bug, poison
.word bug, poison
.word normal, flying
.word normal, flying
.word normal, flying
.word normal, none
.word normal, none
.word normal, flying
.word normal, flying
.word poison, none
.word poison, none
.word electric, none
.word electric, none
.word ground, none
.word ground, none
.word poison, none
.word poison, none
.word poison, ground
.word poison, none
.word poison, none
.word poison, ground
.word normal, none
.word normal, none
.word fire, none
.word fire, none
.word normal, none
.word normal, none
.word poison, flying
.word poison, flying
.word grass, poison
.word grass, poison
.word grass, poison
.word bug, grass
.word bug, grass
.word bug, poison
.word bug, poison
.word ground, none
.word ground, none
.word normal, none
.word normal, none
.word water, none
.word water, none
.word fighting, none
.word fighting, none
.word fire, none
.word fire, none
.word water, none
.word water, none
.word water, fighting
.word psychic, none
.word psychic, none
.word psychic, none
.word fighting, none
.word fighting, none
.word fighting, none
.word grass, poison
.word grass, poison
.word grass, poison
.word water, poison
.word water, poison
.word rock, ground
.word rock, ground
.word rock, ground
.word fire, none
.word fire, none
.word water, psychic
.word water, psychic
.word electric, none
.word electric, none
.word normal, flying
.word normal, flying
.word normal, flying
.word water, none
.word water, ice
.word poison, none
.word poison, none
.word water, none
.word water, ice
.word ghost, poison
.word ghost, poison
.word ghost, poison
.word rock, ground
.word psychic, none
.word psychic, none
.word water, none
.word water, none
.word electric, none

# Pokemon type relationships
# I've normalized the numbers into whole numbers so that no number in the program has to turn into floating point
# 0 = 0, 0.5 = 2, 1 = 4, 2 = 8
# Rows: Attacker, Cols: Defender
array:		.word 4,4,4,4,4,2,4,0,2,4,4,4,4,4,4,4,4
		.word 8,4,2,2,4,8,2,0,8,4,4,4,4,2,8,8,2
		.word 4,8,4,4,4,2,8,4,2,4,4,8,2,4,4,4,4
		.word 4,4,4,2,2,2,4,2,0,4,4,8,4,4,4,4,8
		.word 4,4,0,8,4,8,2,4,8,8,4,2,8,4,4,4,4
		.word 4,2,8,4,2,4,8,4,2,8,4,4,4,4,8,4,4
		.word 4,2,2,2,4,4,4,2,2,2,4,8,4,8,4,8,2
		.word 0,4,4,4,4,4,4,8,4,4,4,4,4,8,4,2,4
		.word 4,4,4,4,4,8,4,4,2,2,2,4,2,4,8,4,8
		.word 4,4,4,4,4,2,8,4,8,2,2,8,4,4,8,4,4
		.word 4,4,4,4,8,8,4,4,4,8,2,2,4,4,4,4,4
		.word 4,4,2,2,8,8,2,4,2,2,8,2,4,4,4,4,4
		.word 4,4,8,4,0,4,4,4,4,4,8,2,2,4,4,4,4
		.word 4,8,4,8,4,4,4,4,2,4,4,4,4,2,4,0,4
		.word 4,4,8,4,8,4,4,4,2,2,2,8,4,4,2,4,4
		.word 4,2,4,4,4,4,4,8,4,4,4,4,4,8,4,2,2
		.word 4,8,4,2,4,4,4,4,2,2,4,4,4,4,4,8,4

# column size for traversing array
cols: .word 17

# messages
msg1: .asciz "\nChoose your 1st pokemon: "
msg2: .asciz "\nChoose your 2nd pokemon: "
err1: .asciz "\nNo pokemon found. Only input numbers 1-100."
msg3: .asciz "\nWinner is(-1 if draw): "

.global main
.text

main:
	li t1, 8 # 8 bytes
	la t5, cols 
	lw t5, 0(t5) # t5 = 17
	li s0, 100 # number of pokemons
	la s1, pokemon # load address of pokemons
	
	input:
	# get 1st pokemon (s2 - pokemon[id] address, s3 - type1, s4 - type2, t3 - pokemon id)
	
	li a7, 4 # print msg1
	la a0, msg1
	ecall
	
	li a7, 5 #get first pokemon 
	ecall
	mv t3, a0
	
	bgt a0, s0, error1 # error check
	ble a0, zero, error1
	
	addi a0, a0, -1 # input - 1 for correct addressing
	mul a0, a0, t1
	add s2, s1, a0 # add (input - 1) to pokemon address to get pokemon
	lw a0, 0(s2) # prints pokemon type #1
	lw a0, 0(a0)
	addi a0, a0, -1
	mv s3, a0
	
	addi s2, s2, 4 # prints pokemon type #2
	lw a0, 0(s2)
	lw a0, 0(a0)
	addi a0, a0, -1
	mv s4, a0
	
	#get 2nd pokemon (s5 - pokemon[id] address, s6 - type1, s7 - type2, t4 - pokemon id)
	li a7, 4
	la a0, msg2
	ecall 
	
	li a7, 5
	ecall
	mv t4, a0
	
	bgt a0, s0, error1
	ble a0, zero, error1
	
	addi a0, a0, -1
	mul a0, a0, t1
	add s5, s1, a0
	lw a0, 0(s5)
	lw a0, 0(a0)
	addi a0, a0, -1
	mv s6, a0
	
	addi s5, s5, 4
	lw a0, 0(s5)
	lw a0, 0(a0)
	addi a0, a0, -1
	mv s7, a0
	mv s7, a0
	
	j battle
	
	#pokemon out of bounds
	error1:
	li a7, 4
	la a0, err1
	ecall
	j input
	
	#registers needed: t3 - pokemon1 id, t4 - pokemon2 id, t5 - cols, s3 - p1t1, s4 - p1t2, s6 - p2t1, s7 - p2t2 (dont overwrite)
	#reset everything to organize registers: t0 - pokemon1, t1 - pokemon2, t2 - cols, s0 - array, s1 - p1t1, s2 - p1t2, s3 - p2t1, s4 - p2t2
	
	#flow: p1t1 vs p2t1 * p1t1 vs p2t2 | p1t2 vs p2t1 * p1t2 vs p2t2       p2t1 vs p1t1 * p2t1 vs p1t2 | p2t2 vs p1t1 * p2t2 vs p1t2
	
	#start pokemon battle
	battle:
	
	li s0, 0
	mv t0, t3
	mv t1, t4
	mv t2, t5
	mv s1, s3
	mv s2, s4
	mv s3, s6
	mv s4, s7
	
	li s11, 2
	li a7, -1
	
	la s0, array
	
	#access p1t1 vs p2t1
	mul s5, s1, t2
	add s5, s5, s3
	slli s5, s5, 2
	
	add s0, s0, s5
	lw a1, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	beq s4, a7, p1t2
	beq s2, a7, p2t1
	
	#p1t1 vs p2t2
	mul s5, s1, t2
	add s5, s5, s4
	slli, s5, s5, 2
	
	add s0, s0, s5
	lw a2, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	#multiply
	mul a1, a1, a2
	
	#p1t2 vs p2t1
	p1t2:
	mul s5, s2, t2
	add s5, s5, s3
	slli, s5, s5, 2
	
	add s0, s0, s5
	lw a2, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	beq s4, a7, p2t1
	
	#p1t2 vs p2t2
	mul s5, s2, t2
	add s5, s5, s4
	slli, s5, s5, 2
	
	add s0, s0, s5
	lw a3, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	#multiply
	mul a2, a2, a3
	
	#average
	add a1, a1, a2
	div a1, a1, s11
	
	p2t1:
	#p2t1 vs p1t1
	mul s5, t2, s3
	add s5, s5, s1
	slli, s5, s5, 2
	
	add s0, s0, s5
	lw a2, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	beq s2, a7, p2t2
	beq s4, a7, cmp
	
	#p2t1 vs p1t2
	
	mul s5, t2, s3
	add s5, s5, s2
	slli, s5, s5, 2
	
	add s0, s0, s5
	lw a3, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	mul a2, a2, a3
	
	p2t2:
	#p2t2 vs p1t1
	mul s5, t2, s4
	add s5, s5, s1
	slli, s5, s5, 2
	
	add s0, s0, s5
	lw a3, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	beq s2, a7, cmp
	
	#p2t2 vs p1t2
	mul s5, t2, s4
	add s5, s5, s2
	slli s5, s5, 2
	
	add s0, s0, s5
	lw a4, 0(s0)
	sub s0, s0, s5
	li s5, 0
	
	#multiply
	mul a3, a3, a4
	
	#average
	add a2, a2, a3
	div a2, a2, s11
	
	cmp:
	
	beq a1, a2, draw
	bgt a1, a2, win1
	bgt a2, a1, win2
	
	win1:
	li a7, 4
	la a0, msg3
	ecall
	li a7, 1
	mv a0, t0
	ecall
	j end
	
	win2:
	li a7, 4
	la a0, msg3
	ecall
	li a7, 1
	mv a0, t1
	ecall
	j end
	
	draw:
	li a7, 4
	la a0, msg3
	ecall
	li a7, 1
	li a0, -1
	ecall
	j end
	
	end:
