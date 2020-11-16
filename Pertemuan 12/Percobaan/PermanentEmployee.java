package Minggu12.Percobaan;

public class PermanentEmployee extends Employee implements Payable {
  private int salary;

  public PermanentEmployee(String name, int salary) {
    this.salary = salary;
    this.name = name;
  }

  public int getSalary() {
    return this.salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public int getPaymentAmount() {
    return (int) (salary + 0.05 * salary);
  }

  @Override
  public String getEmployeeInfo() {
    String info = super.getEmployeeInfo() + "\n";
    info += "Registered as intership employee with salary " + getSalary();
    return info;
  }

}
