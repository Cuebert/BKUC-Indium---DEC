.class Lna/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lna/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static a:Lna/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lna/e;

    invoke-direct {v0}, Lna/e;-><init>()V

    sput-object v0, Lna/e$a;->a:Lna/e;

    return-void
.end method

.method static synthetic a()Lna/e;
    .locals 1

    sget-object v0, Lna/e$a;->a:Lna/e;

    return-object v0
.end method
