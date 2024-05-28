.class Lja/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field private static a:Lja/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lja/e;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lja/e;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lja/e$a;)V

    sput-object v0, Lja/e$d;->a:Lja/e;

    return-void
.end method

.method static synthetic a()Lja/e;
    .locals 1

    sget-object v0, Lja/e$d;->a:Lja/e;

    return-object v0
.end method
