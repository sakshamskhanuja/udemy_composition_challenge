## Composition Challenge

### Description

In this challenge, you need to create an application for controlling a smart kitchen. Your smart kitchen will have several appliances. Your appliances will be Internet Of Things (IoT) devices, which can be programmed.

Write the code to enable your Smart Kitchen application to execute certain jobs. Methods on your <b>SmartKitchen</b> class will determine what work needs to be done:

<ul>
<li><b>addWater</b> will set the Coffee Maker's <b>hasWorkToDo</b> field to <b>true</b>.</li>
<li><b>pourMilk</b> will set Refrigerator's <b>hasWorkToDo</b> to <b>true</b>.</li>
<li><b>loadDishwasher</b> will set the <b>hasWorkToDo</b> flag to <b>true</b>, on that appliance.</li>
</ul>

Your application will access each appliance (by using a getter), execute a method:

<ul>
<li>The appliance methods are <b>orderFood</b> on <b>Refrigerator</b>, <b>doDishes</b> on <b>DishWasher</b>, and <b>brewCoffee</b> on <b>CoffeeMaker</b>.</li>
<li>These methods should check the <b>hasWorkToDo</b> flag, and if <b>true</b>, print a message out, about what work is being done.</li>
</ul>

Your application won't access the appliance directly. It should call <b>doKitchenWork</b>, which delegates the work to any of its appliances.

![Composition Challenge](https://user-images.githubusercontent.com/122201501/212968047-c4febc0c-e3ba-41a3-8519-0fceacf0d187.png)
