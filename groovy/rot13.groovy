#!/usr/bin/env groovy

alphabet = 'a'..'z'
alphabetSize = alphabet.size() as Integer
halfAlphabetSize = (int) alphabetSize / 2

System.in.withReader { input -> 
    System.out.withWriter { output -> 
        input.transformChar(output) { character ->
            def transformed = character
            int offset = alphabet.indexOf(character.toLowerCase())
            if (offset > -1) {
                int newOffset = (offset + halfAlphabetSize) % alphabetSize
                transformed = alphabet[newOffset]
                if (Character.isUpperCase(character as Character)) {
                    transformed = transformed.toUpperCase()
                }
            }
            return transformed
        }
    }
}
