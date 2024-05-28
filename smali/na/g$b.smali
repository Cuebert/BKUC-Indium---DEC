.class Lna/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lna/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static a:Lna/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lna/g;

    invoke-direct {v0}, Lna/g;-><init>()V

    sput-object v0, Lna/g$b;->a:Lna/g;

    return-void
.end method

.method static synthetic a()Lna/g;
    .locals 1

    sget-object v0, Lna/g$b;->a:Lna/g;

    return-object v0
.end method
