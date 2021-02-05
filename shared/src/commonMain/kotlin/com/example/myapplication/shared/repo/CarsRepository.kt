package com.example.myapplication.shared.repo

import com.example.myapplication.shared.model.Car

class CarsRepository {

    fun getCarList(): List<Car> {
        return listOf(
            Car(1, "Volkswagen", "Gold"),
            Car(2, "Honda", "Civic"),
            Car(3, "Nissan", "X-Trail"),
            Car(4, "Nissan", "Rogue"),
            Car(5, "Toyota", "Corolla"),
            Car(6, "Ford", "F Series"),
            Car(7, "Ford", "Fiesta"),
            Car(8, "BMW", "Serie 3"),
            Car(9, "Ford", "Focus"),
            Car(10, "Renault", "Clio")
        )
    }

    fun getCarListReversed(carList: List<Car>): List<Car> {
        return carList.reversed()
    }

}
