DROP TABLE `person`;

CREATE TABLE `person`
(
    `id`   int NOT NULL,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `person` (`id`, `name`) VALUES (1, '张三');