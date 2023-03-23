package com.robosoft.laundryapp.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robosoft.laundryapp.R
import com.robosoft.laundryapp.presentation.ui.theme.BlueBanner
import com.robosoft.laundryapp.presentation.ui.theme.LaundryAppTheme
import com.robosoft.laundryapp.presentation.ui.theme.White
import com.robosoft.laundryapp.presentation.ui.theme.Yellow


@Composable
fun Home() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Yellow)
        )
        Image(
            painter = painterResource(id = R.drawable.brand_icon),
            contentDescription = null,
            modifier = Modifier.align(
                Alignment.TopEnd
            ),
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp, start = 24.dp, end = 24.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            item {
                AppBar()
                UserData()
                AddItem()
                BookNow()
                BuyNow()
                Delivery()
                Offer()
            }
        }
    }
}


@Composable
fun AppBar() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .padding(top = 5.dp)
                .weight(2F)
                .size(36.dp),
            alignment = Alignment.CenterStart
        )
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search",
                modifier = Modifier
                    .weight(1F)
                    .size(24.dp)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.burger_menu),
                contentDescription = "Burger Menu",
                modifier = Modifier
                    .weight(1F)
                    .size(24.dp)
            )
        }
    }
}

@Composable
fun UserData() {
    Box(
        modifier = Modifier
            .padding(top = 25.dp, bottom = 28.dp)
            .background(Color.Transparent)
    ) {
        Column {
            Text(
                text = "Hello! Elavarasan",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
            )
            Text(
                text = "+91 8270733016",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.merriweather_sans_regular))
            )
        }
    }
}

@Composable
fun AddItem() {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(188.dp)
            .padding(bottom = 19.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Next Available Pickup",
                    fontSize = 16.sp,
                    modifier = Modifier.fillMaxWidth(),
                    color = colorResource(
                        id = R.color.blue
                    ), fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "05 JAN | 5PM to 8PM",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_regular))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "order within 15 min to \ncatch this pickup slot.",
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(115.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.yellow
                        ), contentColor = colorResource(id = R.color.blue)
                    )
                ) {
                    Text(
                        text = "Add Item",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.merriweather_sans_light)),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.basketblue),
                contentDescription = "basket",
                modifier = Modifier
                    .weight(1f)
                    .size(126.dp)
                    .scale(1.2f)
                    .offset(-35.dp),
                alignment = Alignment.CenterStart
            )
        }
    }
}

@Composable
fun BookNow() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 13.dp)
            .height(200.dp),
        elevation = 7.dp,
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.banner),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .scale(1.4f)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            BlueBanner,
                            White
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Exclusive offers \n& Discounts",
                    fontSize = 22.sp,
                    color = colorResource(
                        id = R.color.white
                    ),
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Save more with our exciting \noffers and discounts.",
                    fontSize = 12.sp,
                    color = colorResource(
                        id = R.color.white
                    ),
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(19.dp))
                Button(
                    shape = RoundedCornerShape(5.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(115.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.yellow
                        ), contentColor = colorResource(id = R.color.blue)
                    )
                ) {
                    Text(
                        text = "Book Now",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.merriweather_sans_light)),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Composable
fun BuyNow() {
    Card(
        elevation = 7.dp,
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 19.dp)
            .height(160.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = BlueBanner)
        )
        Row(
            modifier = Modifier
                .padding(top = 20.dp, bottom = 20.dp, end = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.clubultimate),
                contentDescription = "basket",
                modifier = Modifier
                    .weight(1f)
                    .offset(27.dp, 13.dp)
                    .size(500.dp)
                    .scale(1.5f)
            )

            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .padding(start = 30.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Membership",
                    fontSize = 22.sp,
                    color = colorResource(
                        id = R.color.white
                    ),
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light)),
                    fontWeight = FontWeight.Light
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Explore exclusive perks with \nour flexible memberships.",
                    fontSize = 12.sp,
                    color = colorResource(
                        id = R.color.white
                    ),
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(19.dp))
                Button(
                    shape = RoundedCornerShape(6.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(115.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.yellow
                        ), contentColor = colorResource(id = R.color.blue)
                    )
                ) {
                    Text(
                        text = "Book Now",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.merriweather_sans_light)),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Composable
fun Delivery() {
    Card(
        modifier = Modifier
            .fillMaxWidth().padding(bottom = 20.dp)
            .height(170.dp),
        elevation = 7.dp,
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.banner_3),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp)
                    .scale(1.5f)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            BlueBanner,
                            White
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "One Day \nDelivery",
                    fontSize = 22.sp,
                    color = colorResource(
                        id = R.color.white
                    ),
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "On Wash + Fold",
                    fontSize = 12.sp,
                    color = colorResource(
                        id = R.color.white
                    ),
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(19.dp))
                Button(
                    shape = RoundedCornerShape(5.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(115.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.yellow
                        ), contentColor = colorResource(id = R.color.blue)
                    )
                ) {
                    Text(
                        text = "Book Now",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.merriweather_sans_light)),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Composable
fun Offer() {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "First 60% OFF",
                    fontSize = 22.sp,
                    modifier = Modifier.fillMaxWidth(),
                    color = colorResource(
                        id = R.color.blue
                    ), fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(9.dp))
                Text(
                    text = "Lorem ipsum is placeholder \ntext commonly",
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.merriweather_sans_light))
                )
                Spacer(modifier = Modifier.height(19.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(115.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.blue
                        ), contentColor = colorResource(id = R.color.white)
                    )
                ) {
                    Text(
                        text = "Book Now",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.merriweather_sans_light)),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.laundry_basket),
                contentDescription = "basket",
                modifier = Modifier
                    .weight(1f)
                    .size(126.dp)
                    .scale(1.3f)
                    .offset(13.dp),
                alignment = Alignment.CenterStart
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LaundryAppTheme {
        Home()
    }
}