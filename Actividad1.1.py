#busqueda Lineal o secuencial
def busquedaLineal(A,n,x):
    num = 0
    encontrado=-1
    for k in range(n):
        num+=1
        if A[k] == x:
            encontrado=k
    return encontrado,num
#Búsqueda Lineal Mejorada
def busquedaLinealMejorada(A,n,x):
    num = 0
    encontrado=-1
    for k in range(n):
        num += 1
        if A[k] == x:
            encontrado=k
            break
    return encontrado,num
#Búsqueda Lineal con Centinela
def busquedaLinealCentinela(A,n,x):
    tmp = A[n]
    A[n]=x
    k=0
    num = 0
    while A[k] != x:
        k=k+1
        num += 1
    print(k)
    A[n]=tmp
    if k < n or A[n]==x:
        return k,num
    else:
        return -1,num
    return encontrado,num
A = [7,0,6,8,4,2,1,9,3,5]
llave=int(input("Ingresa un número entre el 0 y 9:    "))
m,numIte=busquedaLineal(A,len(A),llave)
print(llave,"esta en el indice",m,"y realizo",numIte,"iteraciones")
m,numIte=busquedaLinealMejorada(A,len(A),llave)
print(llave,"esta en el indice",m,"y realizo",numIte,"iteraciones")
m,numIte=busquedaLinealCentinela(A,len(A)-1,llave)
print(llave,"esta en el indice",m,"y realizo",numIte,"iteraciones")
