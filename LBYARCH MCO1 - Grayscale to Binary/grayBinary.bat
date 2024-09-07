nasm -f win64 GrayBinary.asm -o GrayBinary.obj
gcc -c main.c -o main.obj
gcc main.obj GrayBinary.obj -o main.exe