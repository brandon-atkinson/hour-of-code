import static java.util.Collections.shuffle

def numbers = (1..100).toList()

shuffle(numbers)

for (number in numbers) {
    println number
}
