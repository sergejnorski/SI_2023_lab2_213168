<h1>Втора лабораториска вежба по Софтверско инженерство</h1>
<h2>Сергеј Норски, бр. на индекс 213168</h2>
<h3>Control Flow Graph</h3>

![lab2final](https://github.com/sergejnorski/SI_2023_lab2_213168/assets/75416368/46405404-ef76-41d6-86bc-2dd527cd0432)


<h3>Цикломатска комплексност</h3>
<p>Цикломаткса комплексност ја добив со броење на регионите во CFG и според тоа изглегува дека е 11.</p>

<h3>Тест случаи според критериумот Every Branch, користам 7 случаи.</h3>
<p>- Случај кога user==null.<br></p>
<p>- Случај кога username==null тогаш треба username==email </p>
<p>- Случај кога password има дел од username и password.length < 8</p>
<p>- Случај кога има дупликат username и дупликат email во листа на useri</p>
<p>- Случај кога email нема . или @ </p>
<p>- Случај кога password нема " " и има special char</p>
<p>- Случај кога има " " во password</p>

<h3>Тест случаи според критериумот Multiple Condition</h3>
<h4>Според овој критериум може да има 4 случаи односно кога имаме:</h4>
<p>- user == null<br></p>
<p>- User(sergej, null, sergej@finki.com)<br></p>
<p>- User(sergej, Norski123!?, null)<br></p>
<p>- User(sergej, Norski123!?, sergej@finki.com) <br></p>

<h3>Објаснување на напишаните unit tests</h3>
<h4>За тест случаите според критериумот Multiple Condition, напишани се 4 test cases кои го опфаќаат целото барање. Тие се:</h4>
<p>- T-X-X  ->  ова е случај кога user==null односно се исполнува првиот услов.<br></p>
<p>- F-T-X  ->  ове е случај кога user.getPassword()==null односно вториот услов се исполнува. За пример е земено: User(sergej, null, sergej@finki.com)<br></p>
<p>- F-F-T  ->  ова е случај кога user.getEmail()==null однос третиот услов се исполнува. За пример е земено: User(sergej, Norski123!?, null)<br></p>
<p>- F-F-F  ->  во овој случај ни еден услов од if не се исполнува. За пример е земено: User(sergej, Norski123!?, sergej@finki.com)<br></p>
<h4>За тест случаите според критериумот Every Branch, напишани се 7 test cases и со нив се опфаќа целото барање. Тие се:</h4>
<p>- Кога user == null (се тестира branch password==null и email==null)<br></p>
<p>- Кога username == null (во овој случај се тестира доколку нема username дали username==email ќе бидне). Земен пример е: User(null,"Norski123?!","sergej@finki.com")<br></p>
<p>- Кога password contains username and/or password.length < 8. Земен пример е: User("sergej","sergej","sergej@finki.com")<br></p>
<p>- Кога mail нема . или @. Земен пример е: User("sergej","Norski123?!","sergejfinkicom")<br></p>
<p>- Кога user password нема " " и има special char. Земен пример е: User("sergej","Norski123?!","sergej@finki.com")<br></p>
<p>- Кога user има " " во password. Земен пример е: User("sergej","Norski 23?!","sergej@finki.com")</p>
