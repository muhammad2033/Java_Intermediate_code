# def maaz():
#    n = int(input("input digit for n:"))
#    table= int(input("input any digit for table:"))
   
#    for i in range(n):
#        result = table*i
#        print(result)
       
# name=maaz()


class employee:
    
    salary = 10000
    increment = 2.5
    print(f"print the given salary : {salary} and {increment} ")
    @property
    def salaryAfterIncrement(self):
        return self.salary+self.increment
    @salaryAfterIncrement.setter
        
    def salaryAfterIncrement(self,sai):
        self.increment=sai/self.salary
            
        
       
maaz=employee()

print(maaz.salaryAfterIncrement())

print(maaz.increment)
maaz.salaryAfterIncrement=20000
print(maaz.increment)
