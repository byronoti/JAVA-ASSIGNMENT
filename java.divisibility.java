def is_divisible_by_five(number):
    if number % 5 == 0:
        return True
    else:
        return False

def ends_with_five_or_zero(number):
    str_number = str(number)
    last_digit = str_number[-1]
    if last_digit == '5' or last_digit == '0':
        return True
    else:
        return False

def main():
    num = int(input("Enter an integer: "))
    if ends_with_five_or_zero(num):
        print("The number is divisible by 5 because it ends with a 5 or 0.")
    else:
        if is_divisible_by_five(num):
            print("The number is divisible by 5.")
        else:
            print("The number is not divisible by 5.")

if __name__ == "__main__":
    main()
