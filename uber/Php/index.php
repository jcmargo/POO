<?php

require_once('Car.php');
require_once('uberX.php');
require_once('account.php');

$uberX = new UberX("AW456", new Account("Andres Herrera", "AMS123"), "Chevrolet", "Spark");
$uberX->printDataCar();

?>