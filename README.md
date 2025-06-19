# TrackX - Expense Tracker Backend

TrackX is a powerful backend API for expense tracking, designed to help users manage their finances by tracking income, expenses, and generating financial statistics.

## 🚀 Features

- **Income Management**: Track and manage various income sources
- **Expense Tracking**: Record and categorize expenses
- **Financial Statistics**: Generate insights and analytics from your financial data
- RESTful API design for easy integration
- Scalable backend architecture

## 📋 Entities

### Income
Manages all income-related data and operations.

### Expense  
Handles expense tracking and categorization.

### Stats
Provides financial statistics and analytics based on income and expense data.

## 🛠️ Tech Stack

- **Backend Framework**: Spring Boot
- **Database**: SQL Database
- **Architecture**: Layered Architecture (Controller-Service-Repository pattern)

## 📁 Project Structure

```
TrackX/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── trackx/
│                   ├── controller/
│                   │   ├── IncomeController.java
│                   │   ├── ExpenseController.java
│                   │   └── StatsController.java
│                   ├── service/
│                   │   ├── IncomeService.java
│                   │   ├── ExpenseService.java
│                   │   └── StatsService.java
│                   ├── repository/
│                   │   ├── IncomeRepository.java
│                   │   ├── ExpenseRepository.java
│                   │   └── StatsRepository.java
│                   ├── entities/
│                   │   ├── Income.java
│                   │   ├── Expense.java
│                   │   └── Stats.java
│                   └── dto/
│                       ├── IncomeDTO.java
│                       ├── ExpenseDTO.java
│                       └── StatsDTO.java
├── src/
│   └── main/
│       └── resources/
│           ├── application.properties
│           └── data.sql
├── pom.xml
└── README.md
```

## 🔧 Installation

1. Clone the repository:
```bash
git clone https://github.com/Mohmmed-Zaid/TrackX.git
cd TrackX
```

2. Install dependencies:
```bash
mvn clean install
```

3. Set up database configuration in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/trackx_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

server.port=8080
```

4. Create the database:
```sql
CREATE DATABASE trackx_db;
```

5. Run the application:
```bash
mvn spring-boot:run
```

The server will start on `http://localhost:8080`

## 🔌 API Endpoints

### Income Endpoints
```
GET    /api/income          - Get all income records
POST   /api/income          - Create new income record
GET    /api/income/:id      - Get specific income record
PUT    /api/income/:id      - Update income record
DELETE /api/income/:id      - Delete income record
```

### Expense Endpoints
```
GET    /api/expenses        - Get all expense records
POST   /api/expenses        - Create new expense record
GET    /api/expenses/:id    - Get specific expense record
PUT    /api/expenses/:id    - Update expense record
DELETE /api/expenses/:id    - Delete expense record
```

### Stats Endpoints
```
GET    /api/stats           - Get financial statistics
GET    /api/stats/summary   - Get summary statistics
GET    /api/stats/monthly   - Get monthly breakdown
GET    /api/stats/category  - Get category-wise statistics
```

## 📊 Sample API Requests

### Create Income
```json
POST /api/income
{
  "source": "Salary",
  "amount": 5000,
  "date": "2024-01-15",
  "description": "Monthly salary"
}
```

### Create Expense
```json
POST /api/expenses
{
  "category": "Food",
  "amount": 150,
  "date": "2024-01-15",
  "description": "Grocery shopping"
}
```

## 🧪 Testing

Run tests using:
```bash
mvn test
```

For test coverage:
```bash
mvn jacoco:report
```

## 📝 Configuration

| Property | Description | Required |
|----------|-------------|----------|
| `spring.datasource.url` | Database connection URL | Yes |
| `spring.datasource.username` | Database username | Yes |
| `spring.datasource.password` | Database password | Yes |
| `server.port` | Server port (default: 8080) | No |
| `spring.jpa.hibernate.ddl-auto` | Hibernate DDL mode | No |

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Mohammed Zaid**
- GitHub: [@Mohmmed-Zaid](https://github.com/Mohmmed-Zaid)

## 🙏 Acknowledgments

- Thanks to all contributors who helped build TrackX
- Inspired by the need for better personal finance management

## 🔜 Future Enhancements

- [ ] Frontend web application
- [ ] Mobile app integration
- [ ] Advanced analytics and reporting
- [ ] Budget planning features
- [ ] Data export functionality
- [ ] Multi-currency support

---

**Note**: This is a backend-only implementation. Frontend integration is planned for future releases.
