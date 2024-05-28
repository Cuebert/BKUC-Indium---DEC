.class Laa/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Laa/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laa/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laa/f;-><init>(Laa/f$a;)V

    sput-object v0, Laa/f$b;->a:Laa/f;

    return-void
.end method

.method static synthetic a()Laa/f;
    .locals 1

    sget-object v0, Laa/f$b;->a:Laa/f;

    return-object v0
.end method
