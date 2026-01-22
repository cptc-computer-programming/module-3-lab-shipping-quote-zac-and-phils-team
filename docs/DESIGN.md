# Shipping Quote Calculator

I am making a change to the design.

## Cost Formula



Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
// formula could go here
totalCost = baseCost + (weight *weightRate) + (sizeFactor* sizeRate)

```
Size factor selected (choose at least one):
- sqrt(volume)
- surface area: 2(lw + lh + wh)

<!-- - longest side: max(length, width, height)   // selected for size factor --> 

- density: weight / volume
- cube root: volume^(1/3)
- perimeter of footprint: 2(length + width)
- other:

Brief justification (2–4 sentences):

---

## Method List (at least 5)

For each method, keep it short. Include only:

 description (1 sentence)

 inputs (short list)

- output (what it returns)

- return type

Method 1:<!-- CalculateVolume-->

- description: <!-- Calculates the total cubic inches of a package -->
- inputs: <!-- int length, int width, int height -->
- output: <!-- int (volume)-->
- return type: <!-- int -->

Method 2: <!-- DetermineSizeFactor-->

- description:<!-- identify the longest side of the package -->
- inputs:<!-- int length, int width, int height -->
- output:<!-- math.max()  -->
- return type:<!-- double -->

Method 3: <!-- isOverweight-->

- description: <!-- Checks if the package exceeds the max weight -->
- inputs:<!-- double weight -->
- output:<!-- boolean -->
- return type:<!-- boolean -->

Method 4:<!-- calculateBaseCost-->

- description:<!-- returns the base cost of the package-->
- inputs:
- output:
- return type:<!-- double -->

Method 5:<!-- CalculateTotalCost-->

- description:<!-- Combines all factors to get finalPrice -->
- inputs:<!-- double baseCost, double weight, double sizeFactor-->
- output:
- return type:<!-- double (dollar amount) -->
