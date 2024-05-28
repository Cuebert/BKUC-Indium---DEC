.class Ly9/i$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field private static a:Ly9/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly9/i;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly9/i;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Ly9/i$a;)V

    sput-object v0, Ly9/i$d;->a:Ly9/i;

    return-void
.end method

.method static synthetic a()Ly9/i;
    .locals 1

    sget-object v0, Ly9/i$d;->a:Ly9/i;

    return-object v0
.end method
