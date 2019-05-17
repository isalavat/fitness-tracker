create table exercise(
	id int  not null auto_increment,
    name varchar(50) ,
    description varchar(50) ,
    video_link varchar(50) ,
    article_link varchar(50) ,
    primary key (id)
);

create table training_day (
	id int auto_increment ,
	date_of_training timestamp ,
    primary key (id)
);

create table full_exercise(
	id int auto_increment ,
	amount int ,
    weight int ,
    exercise_id int ,
    training_day_id int ,
    primary key (id),
    foreign key (exercise_id) references exercise(id),
    foreign key (training_day_id) references training_day(id)
);


insert into exercise values( 1, 'Name','Description','Video','Article');
insert into exercise values( 2, 'Name2','Description2','Video2','Article2');

insert into training_day values(1, '2017-03-08 11:30:54');
insert into training_day values(2, '2017-03-08 11:30:54');

insert into full_exercise values(1, 10, 15, 1, 1);
insert into full_exercise values(2, 10, 15, 1, 2);
