//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java. Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
public class Main{
    private Integer id;
    private String model;
    private Integer HDD;
    private String color;
    private Integer RAM;
    private String OS;
    private boolean isBooked = false;

    public Main(String model,Integer id){
        this.model = model;
        this.id = id;
        System.out.println("Ноутбук  ID " +Integer.Computer(this.id)"Модель "+this.model)
    }
    public Integer getid(){
        return this.id;
    }
    public String getModel(){
        return this.model;
    }
    public Integer getHDD(){
        return this.HDD;
    }

    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.RAM;
    }
    public String getOS(){
        return this.OS;
    }
    public Boolean getBooking(){
        return this.isBooked;
    }
    public void setColor(String color){
        this.color =color;
    }
    public void setRAM(Integer RAM){
        this.RAM = RAM;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
    public void setHDD(Integer HDD){
        this.HDD = HDD;
    }
    public void Book(){
        if (isBooked==false){
            this.isBooked=true;
        }
        else System.out.println("Ноутбук в резерве");
    }
    @Override
    public String Computer(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD "+this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.RAM);
        sb.append(System.lineSeparator());
        if(this.isBooked==false) sb.append("Не в резерве");
        else sb.append("В резерве");

        
        return(sb.Computer());
    }

    

}
