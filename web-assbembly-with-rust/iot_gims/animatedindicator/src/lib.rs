const KEYFRAMES: [i32; 16] = [0,1,2,3,4,5,6,7, 7,6,5,4,3,2,1,0]; // (1)

extern "C" { // (2)
    fn set_led(led_index: i32, r: i32, g: i32, b: i32);
}

#[no_mangle]
pub extern "C" fn sensor_update(_sensor_id: i32, _sensor_value: f64) -> f64 {
    // NO-OP, don't really care about sensor values
    0.0
}

#[no_mangle]
pub extern "C" fn apply(frame: i32) {
    let idx = frame % 16;

    for x in 0..8 { // (3)
        unsafe {
            set_led(x, 0, 0, 0);
        }
    }
    unsafe {
        set_led(KEYFRAMES[idx as usize], 255, 0, 0); // (4)
    }
}
