# 

## Instalando o java com sdkman

O sdkman funciona como um gerenciador de versões para vários tipos de pacotes, um deles é o java.

Com o sdkman é possível instalar um versão versão pontual do java ou a mais recente.

Vou instalar a verão 11.0.13-zulu, nada impede que você instale outra verão disponível no sdkman, antes pode listar com o comando ``sdk list java``.


```bash
curl -s "https://get.sdkman.io" | bash

source "/home/alan/.sdkman/bin/sdkman-init.sh"

sdk install java 11.0.13-zulu

sdk current java

```

**Fonte:** [sdkman](https://sdkman.io/)

## Primeiro código em Java

```bash

# Criando o arquivo java: 

vim Hello.java
```

Conteúdo do arquivo: 

```java
class Hello {  
   public static void main(String args[]) {  
      System.out.println("Hello Java");     
   }  
}
```


```bash

# Compilando o arquivo java: 

javac Hello.java

# Executando o arquivo java compilado: 
java Hello
```
