# FSE (Fundamentals of Software Engineering)
The laboratory in the discipline Fundamentals of Software Engineering consisted in the creation of a project in Java for a Management System intended for a fast courier company. Applied the fundamental concepts and principles of software engineering in the development of a practical solution for the management of parcel delivery and collection processes. The project involved defining the system requirements, designing the software architecture, implementing essential functionalities such as order management, inventory and driver management, report generation, etc., and testing it. Through this lab, participants gained practical knowledge in software engineering, as well as skills in developing and managing complex software projects, applicable in the context of the express courier industry.

## Project Requirements
Management system for a fast courier company

It is requested to design a management system for a fast courier company that meets the following requirements:

a. The company has several offices in various cities and a list of routes and types of transport available between cities, together with their timetables.

b. A customer presents himself at a company office with the package he wants to send and fills in a form in which his contact details, the destination city and the addressee's contact details are entered. To this, the official adds the weight of the package, if the package is part of one of the following special categories: fragile/precious/dangerous. Precious and dangerous parcels will be transported only if appropriate transport conditions are found.

c. Once the data is entered into the system, it will look for a route as fast as possible, which may be made up of several individual routes, so that the transport conditions are respected and will display the estimated time of the route and the distance.

d. The price is calculated according to the distance of the route, the weight of the package and the necessary transport conditions.

e. The calculated price and the estimated time required are presented to the client for him to approve or not. If the transport is approved by the customer, then the customer will pay for the transport by credit card or cash. The package is picked up by the official, assigned a specific code and registered with the status "in direct transit".

f. Once the package has arrived in the destination city, its status will be changed to "awaiting recipient" and the recipient will be contacted. If he answers, he is notified that he has received the package and is invited to pick it up. If the recipient cannot be contacted for three days, the sender will be called and will be asked whether to extend the waiting time for the package or whether it should be returned. For each additional day of waiting, there is an additional storage fee, calculated according to the weight of the package and the special conditions required by it.

g. If you choose to return the package, its status changes to "return transit" and it will be sent back to the shipping city. If the sender cannot be contacted either, the package will be held for another week, days for which the warehouse fee will have to be paid upon collection, and after these days it will be in the possession of the courier company.

h. The drivers of a transport have the obligation to announce their position in each transit city, so that the sender and the recipient know how much time is left until delivery.

## Project Diagrams
### Use Case Diagram
The use-case diagram is a graphical representation of the interaction between actors and functionalities of a software system. Actors are external entities such as users or other systems, while use cases describe the actions they can perform in the system to achieve a certain result. This diagram helps to understand and communicate system requirements between users and the development team.

![picture alt](https://github.com/victorcb0/FSE/blob/main/Diagrame%20-%20FIS/Use%20case%20-%20final.png)

### Activity Diagram
An activity diagram is a graphical representation of the flow of work within a process or software component. It indicates the activities performed, their order and the decisions made during the process, being useful for modeling and understanding the behavior of systems.

![picture alt](https://github.com/victorcb0/FSE/blob/main/Diagrame%20-%20FIS/Activity%20diagram%20-%20final.png)

### Class Diagram
A class diagram is a graphical representation of the structure and relationships between the classes of a software system. It highlights the classes, their attributes and methods, as well as the associations, aggregations, compositions and other relationships between them. The class diagram provides an overview of the system architecture and how the classes interact with each other, making it a useful tool in the design and development phases of software.

![picture alt](https://github.com/victorcb0/FSE/blob/main/Diagrame%20-%20FIS/Class%20diagram.png)

### Gantt Diagram
A Gantt chart is a graphical representation of the planning and scheduling of activities within a project or process. It shows project activities arranged on the horizontal axis (usually time), and on the vertical axis are the resources or teams responsible for the activities. Each activity is represented by a horizontal bar, the length of which indicates the planned duration for that activity. The Gantt chart is useful for visualizing and managing tasks and their interdependencies within the project, making it easy to track progress and adjust planning in real time.

![picture alt](https://github.com/victorcb0/FSE/blob/main/Diagrame%20-%20FIS/Diagrama%20Gantt%20(1).png)

![picture alt](https://github.com/victorcb0/FSE/blob/main/Diagrame%20-%20FIS/Diagrama%20Gantt%20(2).png)

## Examples From The Project Interface
### Authentication Interface
![picture alt](https://github.com/victorcb0/FSE/blob/main/Imagini%20interfata/Interfata%20-%20Autentificare.png)

### Parcel Interface
![picture alt](https://github.com/victorcb0/FSE/blob/main/Imagini%20interfata/Interfata%20-%20Colete%20client.png)

### Customer Package Information Interface
![picture alt](https://github.com/victorcb0/FSE/blob/main/Imagini%20interfata/Interfata%20-%20Informatie%20colet%20client.png)

### Add Package Information Interface
![picture alt](https://github.com/victorcb0/FSE/blob/main/Imagini%20interfata/Interfata%20-%20Adaugare%20informatie%20colet.png)

### Add New Customer Interface
![picture alt](https://github.com/victorcb0/FSE/blob/main/Imagini%20interfata/Interfata%20-%20Adaugare%20client%20nou.png)
