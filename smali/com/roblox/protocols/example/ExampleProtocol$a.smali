.class Lcom/roblox/protocols/example/ExampleProtocol$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/example/ExampleProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/protocols/example/ExampleProtocol;


# direct methods
.method constructor <init>(Lcom/roblox/protocols/example/ExampleProtocol;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/example/ExampleProtocol$a;->a:Lcom/roblox/protocols/example/ExampleProtocol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 0

    return-void
.end method
