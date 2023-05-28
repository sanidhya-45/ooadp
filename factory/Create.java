package ooadp.factory;

public class Create {

    public TypeOfcustomer createCustomer(String type)
    {
        switch(type)
        {
            case "SeniorCitizen":
                return new Senior();
            case "Regular":
                return new Regular();
            case "Firsttime":
                return new Firsttime();
            case "Kid":
                return new Kid();
            case "Twenty":
                return new Twenty();
            case "Thirty":
                return new Thirty();
            case "Forty":
                return new Forty();
            case "Fifty":
                return new Fifty();
            case "Teenage":
                return new Teenage();
            default:
                throw new IllegalArgumentException("Invalid customer");
        }
    }
}
