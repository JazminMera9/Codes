import hashlib ##libreria para convertir texto

print("Ingrese la contraseña: ")
texto=input()

sha256 = hashlib.sha256()

sha256.update(texto.encode('utf-8'))

hash_resultado = sha256.hexdigest()

print("ingrese otra contraseña: ")
texto2= input()

ssha256 = hashlib.sha256()

ssha256.update(texto2.encode('utf-8'))

hash_resultado2 = ssha256.hexdigest()

if hash_resultado != hash_resultado2:
    print("no son")
else:
    print("si son")

print(hash_resultado)
print(hash_resultado2)

