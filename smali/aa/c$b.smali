.class Laa/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static a:Laa/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Laa/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laa/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Laa/c$a;)V

    sput-object v0, Laa/c$b;->a:Laa/c;

    return-void
.end method

.method static synthetic a()Laa/c;
    .locals 1

    sget-object v0, Laa/c$b;->a:Laa/c;

    return-object v0
.end method
