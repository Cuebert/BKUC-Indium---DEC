.class public final Lu3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu3/b;

.field private static volatile b:Lu3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu3/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu3/c;-><init>(Lu3/d;)V

    .line 2
    sput-object v0, Lu3/a;->a:Lu3/b;

    sput-object v0, Lu3/a;->b:Lu3/b;

    return-void
.end method

.method public static a()Lu3/b;
    .locals 1

    sget-object v0, Lu3/a;->b:Lu3/b;

    return-object v0
.end method
