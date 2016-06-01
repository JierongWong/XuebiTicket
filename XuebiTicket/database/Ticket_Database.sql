CREATE SCHEMA IF  NOT EXISTS `Ticket_Database`

drop table if exists `Ticket_Database`.`Movie`;
drop table if exists `Ticket_Database`.`Cinema`;
drop table if exists `Ticket_Database`.`User`;
drop table if exists `Ticket_Database`.`Order`;
drop table if exists `Ticket_Database`.`Session`;
drop table if exists `Ticket_Database`.`Ticket;

CREATE TABLE `Ticket_Database`.`Movie` (
    `movie_id` INT NOT NULL AUTO_INCREMENT,
    `movie_name` VARCHAR(50) NOT NULL,
    `type` VARCHAR(50) NOT NULL,
    `intro` TEXT,
    `star` FLOAT NOT NULL,
    `movie_length` NOT NULL,
    `movie_director` TEXT NOT NULL,
    `movie_actors` TEXT NOT NULL,
    `start_time` LONG NOT NULL,
    `end_time` LONG NOT NULL,
    PRIMARY KEY(`movie_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Ticket_Database`.`Cinema` (
    `cinema_id` INT NOT NULL AUTO_INCREMENT,
    `cinema_name` VARCHAR(50) NOT NULL,
    `cinema_address` VARCHAR(50) NOT NULL,
    PRIMARY KEY(`cinema_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Ticket_Database`.`User` (
    `user_id` INT NOT NULL AUTO_INCREMENT,
    `user_name` VARCHAR(50) NOT NULL,
    `password` VARCHAR(50) NOT NULL,
    `phone` VARCHAR(50) NOT NULL,
    `email` TEXT NOT NULL,
    PRIMARY KEY(`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Ticket_Database`.`Order` (
    `order_id` INT NOT NULL AUTO_INCREMENT,
    `user_id` INT NOT NULL,
    `cinema_id` INT NOT NULL,
    `order_time` LONG NOT NULL,
    `price` FLOAT NOT NULL,
    `state` enum('Paid','Unpaid','Unvalid') NOT NULL,
    PRIMARY KEY(`order_id`),
    CONSTRAINT `user_order_id`
        FOREIGN KEY(`user_id`)
        REFERENCES `Ticket_Database`.`User` (`user_id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE,
    CONSTRAINT `cinema_order_id`
        FOREIGN KEY(`cinema_id`)
        REFERENCES `Ticket_Database`.`Cinema` (`cinema_id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Ticket_Database`.`Session` (
    `session_id` INT NOT NULL AUTO_INCREMENT,
    `cinema_id` INT NOT NULL,
    `movie_name` VARCHAR(50) NOT NULL,
    `start_time` LONG NOT NULL,
    `end_time` LONG NOT NULL,
    `price` FLOAT NOT NULL,
    PRIMARY KEY(`session_id`),
    CONSTRAINT `cinema_session_id`
        FOREIGN KEY(`cinema_id`)
        REFERENCES `Ticket_Database`.`Cinema` (`cinema_id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Ticket_Database`.`Ticket` (
    `ticket_id` INT NOT NULL AUTO_INCREMENT,
    `order_id` INT NOT NULL,
    `price` FLOAT NOT NULL,
    `session_id` INT NOT NULL,
    PRIMARY KEY(`ticket_id`),
    CONSTRAINT `order_ticket_id`
        FOREIGN KEY(`order_id`)
        REFERENCES `Ticket_Database`.`Order` (`order_id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE,
     CONSTRAINT `session_ticket_id`
        FOREIGN KEY(`session_id`)
        REFERENCES `Ticket_Database`.`Session` (`session_id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
