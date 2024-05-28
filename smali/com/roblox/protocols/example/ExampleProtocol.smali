.class public Lcom/roblox/protocols/example/ExampleProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/example/ExampleProtocol$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/example/ExampleProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/protocols/example/ExampleProtocol;->getPoloId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roblox/protocols/example/ExampleProtocol$a;

    invoke-direct {v2, p0}, Lcom/roblox/protocols/example/ExampleProtocol$a;-><init>(Lcom/roblox/protocols/example/ExampleProtocol;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method private static native getPoloId()Ljava/lang/String;
.end method

.method private static native getProtocolName()Ljava/lang/String;
.end method

.method public static native initializeAndroidExampleProtocol()V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method
