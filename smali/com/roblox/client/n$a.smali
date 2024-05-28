.class Lcom/roblox/client/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Lf7/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf7/b0;

    invoke-direct {v0}, Lf7/b0;-><init>()V

    sput-object v0, Lcom/roblox/client/n$a;->a:Lf7/b0;

    return-void
.end method

.method static synthetic a()Lf7/b0;
    .locals 1

    sget-object v0, Lcom/roblox/client/n$a;->a:Lf7/b0;

    return-object v0
.end method
