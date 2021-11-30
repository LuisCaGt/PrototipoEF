SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE SCHEMA IF NOT EXISTS `empresarial` DEFAULT CHARACTER SET utf8mb4;
USE `empresarial`;

-- -----------------------------------------------------
-- INICIO MANTENIMIENTOS
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `empresarial`.`tbl_clasificacioncuenta` (
  `Codigo_clasificacion` INT NOT NULL AUTO_INCREMENT,
  `Clasificacion_CuentaNombre` VARCHAR(100) NOT NULL,
  `Descripcion_Clasificacion` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`Codigo_clasificacion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
INSERT INTO `empresarial`.`tbl_clasificacioncuenta`
VALUES 
('1', 'Activo', 'Acciones'),
('2', 'Activo', 'Acciones'),
('3', 'Debe', 'Aguinaldo'),
('4', 'Debe', 'Alquiler'),
('5', 'Activo', 'Acciones');

CREATE TABLE IF NOT EXISTS `empresarial`.`tbl_cuentacontable` (
  `Codigo_CuentaContable` INT NOT NULL AUTO_INCREMENT,
  `Nombre_CuentaContable` VARCHAR(100) NULL DEFAULT NULL,
  `Clasificacion_CuentaContable` INT NULL DEFAULT NULL,
  `Estado_CuentaContable` VARCHAR(100) NULL DEFAULT NULL,
  `Monto_CuentaContable` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`Codigo_CuentaContable`),
  CONSTRAINT `fk_cuentacontable_clasificacioncuenta1`
    FOREIGN KEY (`Clasificacion_CuentaContable`)
    REFERENCES `empresarial`.`tbl_clasificacioncuenta` (`Codigo_clasificacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;