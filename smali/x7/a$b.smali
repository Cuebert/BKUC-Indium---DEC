.class Lx7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final a:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx7/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx7/a;-><init>(Lx7/a$a;)V

    sput-object v0, Lx7/a$b;->a:Lx7/a;

    return-void
.end method
