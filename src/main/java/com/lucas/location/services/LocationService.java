package com.lucas.location.services;

import com.lucas.location.models.Location;
import com.lucas.location.models.dto.LocationDto;
import com.lucas.location.repositories.LocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createLocation(LocationDto locationDto) {
        Location location = new Location();
        location.setCity(locationDto.getCity());
        location.setCountry(locationDto.getCountry());
        location.setPostalCode(locationDto.getPostalCode());
        location.setStreetName(locationDto.getStreetName());
        location.setStreetNumber(locationDto.getStreetNumber());
        location.setStreetNumberAddition(locationDto.getStreetNumberAddition());
        return this.saveLocation(location);
    }

    public Location saveLocation(Location location) {
        return this.locationRepository.save(location);
    }

    public Location getLocationById(Long id) {
        return this.locationRepository.getById(id);
    }
}
