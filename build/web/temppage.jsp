<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/jquery.rateyo.min.js" type="text/javascript"></script>
            <link href="css/jquery.rateyo.min.css" rel="stylesheet" type="text/css"/>

    </head>
    <body onload="getavg('new')">
        <div class="container">
            <div class="jumbotron" style="text-align: center">
                <h1>Star Rating with JQuery Demo</h1>
            </div>

            <div class="col-sm-4 col-sm-offset-2" style="text-align: center">
                <label>Add New Rating</label>
            </div>

            <div class="col-sm-4" style="text-align: center">
                <label>Average Rating</label>
            </div>

            <!--div that shows rating bar-->
            <div class="col-sm-2 col-sm-offset-3">
                <center><div id="giverating"></div></center>
            </div> 
            <h4 class="col-sm-2" id="newratingtext"></h4>

            <!--div that shows a average rating-->
            <div class="col-sm-2">
                <center><div id="averagerating"></div></center>
            </div>
            <h4 class="col-sm-2" id="ratingtext"></h4>

            <div class="col-sm-4 col-sm-offset-2" style="text-align: center">
                <label>This Rating will be added to the database</label>
            </div>

            <!--div that shows a average rating-->
            <div class="col-sm-4" style="text-align: center">
                <label>This is the average of all the ratings in the database</label>
            </div>

            <div class="col-sm-offset-2 col-sm-8 alert alert-danger" style="margin-top: 20px">
                <label>This page uses a Database to store ratings</label>
            </div>

        </div>

        <script>
            /////Create Rating Bar and add onclick listener/////
            $('#giverating').rateYo({
                halfStar: true,
                onSet: function (rating, rateYoInstance)
                {
                    addRating(rating);
                }
            });

            /////Create Average Rating Bar/////
            $('#averagerating').rateYo({
                rating: 0,
                readOnly: true
            });
            document.getElementById('ratingtext').innerHTML = '0/5';

            /////Function to get Average Rating from Database//////
            function getavg(from)
            {
                var xml = new XMLHttpRequest();

                xml.onreadystatechange = function ()
                {
                    if (xml.readyState == 4 && xml.status == 200)
                    {
                        var response = xml.responseText.trim();

                        alert("average: " + response);
                        /////Create rating bar that shows average rating/////
                        if (from == 'new')
                        {
                            $('#averagerating').rateYo({
                                rating: response,
                                readOnly: true
                            });
                            document.getElementById('ratingtext').innerHTML = response + '/5';
                        } else
                        {
                            $('#averagerating').rateYo('rating', response);
                            document.getElementById('ratingtext').innerHTML = response + '/5';
                        }
                    }
                };
                xml.open('GET', './getAverageRating', true);
                xml.send();
            }

            ////Function to Add Rating to Database//////
            function addRating(score)
            {
                alert('score: ' + score);

                var xml = new XMLHttpRequest();

                xml.onreadystatechange = function ()
                {
                    if (xml.readyState == 4 && xml.status == 200)
                    {
                        var response = xml.responseText.trim();

                        if (response == "success")
                        {
                            getavg('old');
                        } else
                        {
                            alert("Failed to add rating");
                        }
                    }
                };
                xml.open('GET', './AddRating?score=' + score, true);
                xml.send();
                document.getElementById('newratingtext').innerHTML = score + '/5';
            }
        </script>
    </body>
</html>
