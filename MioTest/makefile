# Nome del file sorgente (senza estensione)
SRC = MioTest
# Nome del file classe generato
TARGET = $(SRC).class

# Regola di default: compila il programma
all: $(TARGET)

# Regola per compilare il file sorgente
$(TARGET): $(SRC).java
	javac $(SRC).java

# Regola per pulire i file generati
clean:
	rm -f $(TARGET)

# Regola per eseguire il programma
run:
	java $(SRC)
