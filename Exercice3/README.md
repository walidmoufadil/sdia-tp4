# `Main` Class

## Description
The `Main` class demonstrates the usage of `HashSet` in Java to perform set operations such as intersection and union. Two sets of strings are used to represent two groups, and the program calculates the intersection and union of these groups. The operations are implemented using basic `Set` methods such as `add()`, `contains()`, and iteration.

## Attributes
- **`group1`**: A `HashSet<String>` representing the first group of people.
- **`group2`**: A `HashSet<String>` representing the second group of people.


### Main Method
- `main(String[] args)` : The entry point of the program where the following operations are performed:
    1. Two sets of names (`group1` and `group2`) are initialized.
    2. The **intersection** of the two sets is calculated by finding common elements.
    3. A new set union is created by copying all elements from group1.
       The addAll method is used to add elements from group2 to the union set, ensuring that no duplicates are included.

### Operations Performed
1. **Intersection**: Finds and prints the common elements between `group1` and `group2`. This represents the intersection of the two sets.
2. **Union**: Combining two sets without duplicates using the addAll() method.

## Example Output

***[](captures/Ex3-exe.png)***

