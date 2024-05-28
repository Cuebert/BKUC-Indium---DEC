.class Lx7/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field static final a:Lx7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx7/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx7/d;-><init>(Lx7/d$a;)V

    sput-object v0, Lx7/d$d;->a:Lx7/d;

    return-void
.end method
