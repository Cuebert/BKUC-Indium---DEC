.class public Lcom/roblox/universalapp/messagebus/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:Lorg/json/JSONObject;

.field c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/roblox/universalapp/messagebus/b;->a:Lorg/json/JSONObject;

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/roblox/universalapp/messagebus/b;->b:Lorg/json/JSONObject;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/roblox/universalapp/messagebus/b;->c:I

    return-void
.end method
