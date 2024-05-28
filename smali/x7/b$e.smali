.class Lx7/b$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# static fields
.field static final a:Lx7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx7/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx7/b;-><init>(Lx7/b$a;)V

    sput-object v0, Lx7/b$e;->a:Lx7/b;

    return-void
.end method
