.class Lja/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static a:Lja/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lja/j;

    invoke-direct {v0}, Lja/j;-><init>()V

    sput-object v0, Lja/j$a;->a:Lja/j;

    return-void
.end method

.method static synthetic a()Lja/j;
    .locals 1

    sget-object v0, Lja/j$a;->a:Lja/j;

    return-object v0
.end method
