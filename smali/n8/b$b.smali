.class Ln8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final a:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln8/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln8/b;-><init>(Ln8/b$a;)V

    sput-object v0, Ln8/b$b;->a:Ln8/b;

    return-void
.end method
