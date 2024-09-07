section .text
bits 64
default rel

global cvtGrayToBinary
cvtGrayToBinary:  
    xor rax, rax
    xor r10, r10
    xor r11, r11
    xor r12, r12
    xor r13, r13
    xor r14, r14
    xor r15, r15
    
    push rbp
    mov rbp, rsp
    
    lea rsi, [rdx]
    lea rdi, [rcx]
    
    mov eax, r8d
    mul r9d
    mov r10d, eax
    
    mov r11d, [rbp + 48]
    xor rax, rax
    
    L1:
    mov ebx, [rsi + r13 * 4]
    cmp ebx, r11d
    ja white
    mov dword[rdi + r13 * 4], 0
    jmp black
    
    white:
    mov dword[rdi + r13 * 4], 255
    
    black:
    inc r13
    dec r10
    jnz L1
    
    pop rbp
    xor rax, rax
    ret
      