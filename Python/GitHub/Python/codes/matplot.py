import numpy as np
from matplotlib import pyplot as plt
input()
mat1=np.matrix('1 0 2 ; 0 3 5 ; 0 0 21')
x=np.array([1,2,3,4,5])
y=np.array([round(np.linalg.det(mat1)),round(np.linalg.det(mat1*2)),round(np.linalg.det(mat1*3)),round(np.linalg.det(mat1*4)),round(np.linalg.det(mat1*5))])
for a,b in zip(x,y):
    print(a,":",b)
plt.plot(x,y)
plt.savefig("sa.png")