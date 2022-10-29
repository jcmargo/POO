<?php
require_once('car.php');
class UberBlack extends Car {
    public $typeCarAccepted;
    public $material;

    public function __construct($license, $driver, $typeCarAccepted, $material) {
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->material = $material;
      }
}
?>