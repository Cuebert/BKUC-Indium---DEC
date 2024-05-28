.class final Lk2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lk2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk2/d;

    invoke-direct {v0}, Lk2/d;-><init>()V

    sput-object v0, Lk2/d$a;->a:Lk2/d;

    return-void
.end method

.method static synthetic a()Lk2/d;
    .locals 1

    sget-object v0, Lk2/d$a;->a:Lk2/d;

    return-object v0
.end method
