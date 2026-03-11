package lab3;

abstract public class Vehicle {
    private String brand;
    private double speed;
    private double fuelLevel;
    private boolean isRunning;
    private final double maxSpeed;
    private double accelerationRate;
    private double consumptionRate;

    public Vehicle(String brand, double fuelLevel, double maxSpeed, double accelerationRate, double consumptionRate) {
        this.brand = brand;
        this.fuelLevel = fuelLevel;
        this.maxSpeed = maxSpeed;
        this.accelerationRate = accelerationRate;
        this.consumptionRate = consumptionRate;

        this.speed = 0.0;
        this.isRunning = false;
    }

    public void accelerate() {
        if (!isRunning) {
            System.out.println("Motor Çalışmıyor!");
            displayStatus();
            return;
        }

        if (fuelLevel - 0.05 <= 0) {
            System.out.println("Yakıt Bitti!");
            fuelLevel = 0;
            isRunning = false;
            displayStatus();
            speed = 0;
        }
        else {
            fuelLevel -= 0.05;

            if (speed > 0) {
                if (fuelLevel < consumptionRate * speed / maxSpeed) {
                    speed += ((accelerationRate / ((speed / maxSpeed) * consumptionRate)) * fuelLevel);
                    fuelLevel = 0;
                    isRunning = false; // yakıt bitme durumu
                    System.out.println("Yakıt Bitti!");
                    displayStatus();
                    speed = 0;
                    System.out.println("Hız 0' landı");

                }
                else {
                    if (speed + accelerationRate <= maxSpeed) {
                        fuelLevel -= consumptionRate * (speed / maxSpeed);
                        speed += accelerationRate; // Normal Durum
                        displayStatus();
                    } else { // Max hız durumu
                        fuelLevel -= (maxSpeed - speed) / (accelerationRate / (consumptionRate * (speed / maxSpeed)));
                        speed = maxSpeed;
                        System.out.println("Hız Maksimuma ulaştı!");
                        displayStatus();
                    }
                }
            }
            else if (speed == 0) {
                if (consumptionRate >= fuelLevel) {
                    speed += (accelerationRate / consumptionRate) * fuelLevel;
                    isRunning = false;
                    fuelLevel = 0;
                    System.out.println("Yetersiz Yakıt!");
                    displayStatus();
                    speed = 0;
                    System.out.println("Hız 0' landı");
                }
                else {
                    fuelLevel -= consumptionRate;
                    speed += accelerationRate; // Normal Durum
                    displayStatus();
                }
            }
        }

    }

    public void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Motor Çalıştırıldı!");
            displayStatus();
        }
        else if (fuelLevel < 0.05) {
            System.out.println("Yakıt Yetersiz! Motor çalıştırılamadı");
            displayStatus();
        }
    }


    public void displayStatus() {
        String engineState = isRunning ? "Çalışıyor" : "KAPALI";
        System.out.printf("Marka: %-12s | Motor: %-6s | Hız: %6.2f km/h | Yakıt: %6.2f L %n",
                brand,
                engineState,
                speed,
                fuelLevel);
    }

    public void brake() {
        isRunning = false;
        speed = 0;
        System.out.println("Frene basıldı! Hız: 0");
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected double getSpeed() {
        return speed;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected double getFuelLevel() {
        return fuelLevel;
    }

    protected void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    protected boolean isRunning() {
        return isRunning;
    }

    protected void setRunning(boolean running) {
        isRunning = running;
    }

    protected double getMaxSpeed() {
        return maxSpeed;
    }

    protected double getAccelerationRate() {
        return accelerationRate;
    }

    protected void setAccelerationRate(double accelerationRate) {
        this.accelerationRate = accelerationRate;
    }

    protected double getConsumptionRate() {
        return consumptionRate;
    }

    protected void setConsumptionRate(double consumptionRate) {
        this.consumptionRate = consumptionRate;
    }
}
