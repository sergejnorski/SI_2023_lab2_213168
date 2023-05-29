<h1>Втора лабораториска вежба по Софтверско инженерство</h1>
<h2>Сергеј Норски, бр. на индекс 213168</h2>
<h3>Control Flow Graph</h3>

![lab2final](https://github.com/sergejnorski/SI_2023_lab2_213168/assets/75416368/26606f45-b442-41c8-9a1d-8b0ac484883e)

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
<p>Според овој критериум може да има 4 случаи односно кога имаме:</p>
<p>- T-X-X  ->  ова е случај кога user==null односно се исполнува првиот услов.<br></p>
<p>- F-T-X  ->  ове е случај кога user.getPassword()==null односно вториот услов се исполнува. Пример: User(sergej, null, sergej@finki.com)<br></p>
<p>- F-F-T  ->  ова е случај кога user.getEmail()==null однос третиот услов се исполнува. Пример: User(sergej, Norski123!?, null)<br></p>
<p>- F-F-F  ->  во овој случај ни еден услов од if не се исполнува. Пример: User(sergej, Norski123!?, sergej@finki.com) <br></p>
