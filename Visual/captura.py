from PIL import ImageGrab
import keyboard
import time

intervalo = 10  # Intervalo de tiempo en segundos

while True:
    tiempo_inicial = time.time()
    while True:
        screenshot = ImageGrab.grab()
        screenshot.save("screenshot.png")

        if keyboard.is_pressed("esc"):
            break

        tiempo_actual = time.time()
        if tiempo_actual - tiempo_inicial >= intervalo:
            break

def on_key_event(e):
    if e.event_type == keyboard.KEY_DOWN:
        print(f"Tecla presionada: {e.name}")
    elif e.event_type == keyboard.KEY_UP:
        print(f"Tecla liberada: {e.name}")

keyboard.hook(on_key_event)

# Espera a que se presione "Esc" antes de salir del programa
keyboard.wait("esc")
keyboard.unhook_all()
