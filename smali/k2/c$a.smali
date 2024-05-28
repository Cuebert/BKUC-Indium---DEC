.class final Lk2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lk2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk2/c;

    invoke-direct {v0}, Lk2/c;-><init>()V

    sput-object v0, Lk2/c$a;->a:Lk2/c;

    return-void
.end method

.method static synthetic a()Lk2/c;
    .locals 1

    sget-object v0, Lk2/c$a;->a:Lk2/c;

    return-object v0
.end method
