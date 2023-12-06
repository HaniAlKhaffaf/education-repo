const mongoose = require('mongoose');

const userSchema = new mongoose.Schema({
    _id: {
        type: mongoose.Schema.Types.ObjectId,
        default: mongoose.Types.ObjectId,
    },
    username: String,
    password: String,
});

const User = mongoose.model('User', userSchema);

module.exports = User;

