.class Lea/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lea/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field private static final a:Lea/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lea/d;

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lea/d;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lea/d$a;)V

    sput-object v0, Lea/d$c;->a:Lea/d;

    return-void
.end method

.method static synthetic a()Lea/d;
    .locals 1

    sget-object v0, Lea/d$c;->a:Lea/d;

    return-object v0
.end method
